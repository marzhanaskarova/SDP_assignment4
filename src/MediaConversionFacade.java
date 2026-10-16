public class MediaConversionFacade {

    private final MetadataReader metadataReader;
    private final CodecFactory codecFactory;
    private final BitrateReader bitrateReader;
    private final AudioMixer audioMixer;

    public MediaConversionFacade() {
        metadataReader = new MetadataReader();
        codecFactory = new CodecFactory();
        bitrateReader = new BitrateReader();
        audioMixer = new AudioMixer();
    }

    public String convert(String fileName, String targetFormat) {
        System.out.println("Starting conversion...");

        String metadata = metadataReader.readMetadata(fileName);
        String codec = codecFactory.chooseCodec(targetFormat);
        String convertedData = bitrateReader.convert(fileName, codec);
        String result = audioMixer.fixAudio(convertedData);

        System.out.println(metadata);
        System.out.println("Conversion completed!");

        return result;
    }
}
