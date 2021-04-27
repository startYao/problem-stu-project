package pattern.creational.factorymethod;

public class FeVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FeVideo();
    }
}
