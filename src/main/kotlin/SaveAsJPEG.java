import java.io.*;

import org.apache.batik.transcoder.image.JPEGTranscoder;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;

public class SaveAsJPEG {

    public static void main(String[] args) throws Exception {

        // Create a JPEG transcoder
        JPEGTranscoder t = new JPEGTranscoder();

        // Set the transcoding hints.
        t.addTranscodingHint(JPEGTranscoder.KEY_QUALITY,
                .01f);
        // Create the transcoder input.
        String svgURI = new File("C:\\Users\\shmue\\Downloads\\diagnosis predictor.svg").toURL().toString();
        TranscoderInput input = new TranscoderInput(svgURI);

        // Create the transcoder output.
        OutputStream ostream = new FileOutputStream("C:\\Users\\shmue\\OneDrive\\IdeaProjects\\TherapyToolkit-Working\\diagnosis predictor.jpg");
        TranscoderOutput output = new TranscoderOutput(ostream);
        // Save the image.
        t.transcode(input, output);

        // Flush and close the stream.
        ostream.flush();
        ostream.close();
        System.exit(0);
    }
}