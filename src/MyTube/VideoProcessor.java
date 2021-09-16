package MyTube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService emailservice;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, EmailService emailservice) {
        this.encoder = encoder;
        this.database = database;
        this.emailservice = emailservice;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailservice.sendEmail(video.getUser());
    }
}
