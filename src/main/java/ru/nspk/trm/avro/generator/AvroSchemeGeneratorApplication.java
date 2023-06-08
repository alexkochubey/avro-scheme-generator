package ru.nspk.trm.avro.generator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.Schema;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.FileSystemUtils;
import ru.nspk.trm.common.algorithm.model.avro.BaseMatchingTask;
import ru.nspk.trm.common.algorithm.model.avro.MatchingResult;
import ru.nspk.trm.common.trm.model.avro.BankRequest;
import ru.nspk.trm.common.trm.model.avro.OfdRecord;
import ru.nspk.trm.common.trm.model.avro.ReqRecord;
import ru.nspk.trm.common.trm.model.avro.RespRecord;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

@Slf4j
@SpringBootApplication
public class AvroSchemeGeneratorApplication implements CommandLineRunner {

    private static final Path path = Path.of("./schemes/avro/");

    public static void main(String[] args) {
        SpringApplication.run(AvroSchemeGeneratorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        FileSystemUtils.deleteRecursively(path);
        generateAvroSchema(BankRequest.class, path.resolve("common/bankRequest.avsc"));
        generateAvroSchema(OfdRecord.class, path.resolve("common/odfRecord.avsc"));
        generateAvroSchema(ReqRecord.class, path.resolve("common/reqRecord.avsc"));
        generateAvroSchema(RespRecord.class, path.resolve("common/respRecord.avsc"));

        generateAvroSchema(BaseMatchingTask.class, path.resolve("algorithm/baseMatchingTask.avsc"));
        generateAvroSchema(MatchingResult.class, path.resolve("algorithm/matchingResult.avsc"));
    }

    private void generateAvroSchema(Class<?> clazz, Path path) throws IOException {
        log.info("Generate avro by class " + clazz.getName());
        ObjectMapper mapper = new ObjectMapper(new AvroFactory());
        AvroSchemaGenerator avroSchemaGenerator = new AvroSchemaGenerator();
        mapper.acceptJsonFormatVisitor(clazz, avroSchemaGenerator);
        AvroSchema schemaWrapper = avroSchemaGenerator.getGeneratedSchema();

        Schema avroSchema = schemaWrapper.getAvroSchema();
        String asJson = avroSchema.toString(true);
        log.info("Schema: " + asJson);
        Files.createDirectories(path.getParent());
        Files.writeString(path, asJson, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
