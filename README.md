# Assignment 4: Facade Design Pattern

## Project Description

This project demonstrates the **Facade Design Pattern** in Java. It simplifies a media conversion process by providing one interface to several subsystem classes.

The client uses one method, `convert()`, instead of calling every subsystem separately.

## Technologies Used

- Java
- JDK 17
- IntelliJ IDEA

## Project Structure

```text
src/
├── Main.java
├── MediaConversionFacade.java
├── MetadataReader.java
├── CodecFactory.java
├── BitrateReader.java
└── AudioMixer.java
```

## Classes

- **Main**: Runs the program and calls the Facade.
- **MediaConversionFacade**: Coordinates the conversion process.
- **MetadataReader**: Simulates reading file metadata.
- **CodecFactory**: Selects the target codec.
- **BitrateReader**: Simulates file data conversion.
- **AudioMixer**: Simulates audio processing.

## How It Works

1. The client calls `convert("video.avi", "mp4")`.
2. The Facade reads the file metadata.
3. The codec is selected.
4. The file data conversion is simulated.
5. Audio processing is simulated.
6. The final result is returned to the client.

## Example Output

```text
Starting conversion...
Reading metadata from: video.avi
MP4 codec selected
Reading file data...
Converting file to MP4 format...
Processing audio...
Metadata for video.avi
Conversion completed!
```

## Clean Code Principles

This project demonstrates the following principles:

1. **Meaningful Names**: Classes and methods have clear names.
2. **Single Responsibility Principle**: Each subsystem class has a specific responsibility.
3. **Encapsulation**: The Facade keeps its subsystem references private.
4. **Low Coupling**: The client communicates with the Facade instead of coordinating subsystem classes directly.
5. **Error Handling**: Invalid file names and unsupported formats are checked.

## Advantages of the Facade Pattern

- Simplifies complex operations.
- Reduces dependencies between the client and subsystem classes.
- Makes the code easier to understand and maintain.

## Limitations

This project simulates media conversion using strings and console messages. It does not convert actual video files.

## Conclusion

The Facade Design Pattern provides a simple interface to a complex subsystem. In this project, `MediaConversionFacade` coordinates several classes through one `convert()` method.

## Author

Marzhan Askarova

Astana IT University  
Group: SE-2526
