package core.basesyntax.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderImpl implements FileReader {

    @Override
    public List<String> read(String filename) throws IOException {
        Path path = Path.of(filename);
        return Files.readAllLines(path);
    }
}

