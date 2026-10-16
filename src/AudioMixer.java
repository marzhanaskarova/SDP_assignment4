public class AudioMixer {

    public String fixAudio(String convertedData) {
        if (convertedData == null || convertedData.isBlank()) {
            throw new IllegalArgumentException("Audio data cannot be empty");
        }

        System.out.println("Processing audio...");
        return convertedData + " with processed audio";
    }
}
