package com.obushko.ua.FullStack.AWS.backet;

public enum BucketName {
    PROFILE_IMAGE("spring-uploaded-imag");
    private final String bucketName;
    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
