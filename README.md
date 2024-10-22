# Image Compressor Library

The Image Compressor Library allows you to compress images without any loss in quality. It supports multiple formats including JPEG, PNG, and WEBP.

## Features
- Lossless compression for JPEG, PNG, and WEBP images
- Easy to integrate into any Android project

## Getting Started

### Installation

To start using the Image Compressor Library, add the following dependency to your project:

```gradle
implementation("com.github.Nikhil-Mandle:image-compressor:1.0.0")


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

### Usage
```
To compress an image, simply pass the content uri file to the library's compression method. Example:
        scope.launch {
            val compressedImage = imageCompressor.compressImage(
                contentUri = contentUri,
                compressionThresholdInKb = 300

            )
}
```
