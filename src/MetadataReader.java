public class MetadataReader {

    public String readMetadata(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("File name cannot be empty");
        }

        System.out.println("Reading metadata from: " + fileName);
        return "Metadata for " + fileName;
    }
}
