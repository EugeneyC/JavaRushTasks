package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {


    public static ImageReader getImageReader(ImageTypes imageReader) {
        if (imageReader == ImageTypes.JPG) {
            return new JpgReader();
        } if (imageReader == (ImageTypes.BMP)) {
            return new BmpReader();
        } if (imageReader == (ImageTypes.PNG)) {
            return new PngReader();
        } throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
