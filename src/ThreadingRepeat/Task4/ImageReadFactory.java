package ThreadingRepeat.Task4;

public class ImageReadFactory {

    public static ImageReader getImageReader(ImageTypes type) {
        if(type==null) {
            throw new IllegalArgumentException("Unknown type of picture");
        }
        ImageReader imageReader;
        switch (type) {
            case BMP:imageReader = new BmpReader();
            break;
            case JPG:imageReader = new JpgReader();
            break;
            case PNG:imageReader = new PngReader();
            break;
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        return imageReader;
    }
}
