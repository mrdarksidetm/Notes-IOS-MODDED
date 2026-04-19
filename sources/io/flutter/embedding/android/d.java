package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f12799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f12800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f12801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f12802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f12803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    a f12804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f12805g;

    public enum a {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f12812a;

        a(long j10) {
            this.f12812a = j10;
        }

        public long b() {
            return this.f12812a;
        }
    }

    public enum b {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f12817a;

        b(long j10) {
            this.f12817a = j10;
        }

        public long b() {
            return this.f12817a;
        }
    }

    ByteBuffer a() {
        try {
            String str = this.f12805g;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(this.f12799a);
            byteBufferAllocateDirect.putLong(this.f12800b.b());
            byteBufferAllocateDirect.putLong(this.f12801c);
            byteBufferAllocateDirect.putLong(this.f12802d);
            byteBufferAllocateDirect.putLong(this.f12803e ? 1L : 0L);
            byteBufferAllocateDirect.putLong(this.f12804f.b());
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            return byteBufferAllocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
