public class BitrateReader {

    public String convert(String fileName, String codec) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("File name cannot be empty");
        }

        System.out.println("Reading file data...");
        String data = "Data from " + fileName;

        System.out.println("Converting file to " + codec + " format...");
        return data + " converted to " + codec;
    }
}
