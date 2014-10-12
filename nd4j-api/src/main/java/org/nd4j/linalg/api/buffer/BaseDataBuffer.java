package org.nd4j.linalg.api.buffer;

import java.nio.ByteBuffer;

/**
 * Base class for a data buffer handling basic byte operations among other things.
 * @author Adam Gibson
 */
public abstract  class BaseDataBuffer implements DataBuffer {

    protected int length;

    protected BaseDataBuffer(int length) {
        this.length = length;
    }

    @Override
    public int length() {
        return length;
    }


    public static byte[] toByteArray(double value) {
        byte[] bytes = new byte[8];
        ByteBuffer.wrap(bytes).putDouble(value);
        return bytes;
    }

    public static byte[] toByteArray(float value) {
        byte[] bytes = new byte[4];
        ByteBuffer.wrap(bytes).putFloat(value);
        return bytes;
    }


    public static byte[] toByteArray(int value) {
        byte[] bytes = new byte[4];
        ByteBuffer.wrap(bytes).putFloat(value);
        return bytes;
    }

    public static double toDouble(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getDouble();
    }

    public static int toInt(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getInt();
    }

    public static float toFloat(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getFloat();
    }

    @Override
    public <E> E getElement(int i) {
        throw new UnsupportedOperationException();

    }

    @Override
    public <E> void put(int i, E element) {
        throw new UnsupportedOperationException();
    }

}
