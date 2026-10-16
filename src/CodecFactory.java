public class CodecFactory {

    public String chooseCodec(String targetFormat) {
        if (targetFormat == null || targetFormat.isBlank()) {
            throw new IllegalArgumentException("Format cannot be empty");
        }

        if (targetFormat.equalsIgnoreCase("mp4")) {
            System.out.println("MP4 codec selected");
            return "MP4";
        } else if (targetFormat.equalsIgnoreCase("ogg")) {
            System.out.println("OGG codec selected");
            return "OGG";
        } else {
            throw new IllegalArgumentException("Unsupported format: " + targetFormat);
        }
    }
}
