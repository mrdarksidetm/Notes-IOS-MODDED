package h4;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f11823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f11824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f11827e = d.a();

    protected int a(int i10) {
        return i10 + this.f11824b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f11826d) {
            return this.f11824b.getShort(this.f11825c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f11824b = byteBuffer;
        if (byteBuffer != null) {
            this.f11823a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f11825c = i11;
            s10 = this.f11824b.getShort(i11);
        } else {
            s10 = 0;
            this.f11823a = 0;
            this.f11825c = 0;
        }
        this.f11826d = s10;
    }

    protected int d(int i10) {
        int i11 = i10 + this.f11823a;
        return i11 + this.f11824b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f11823a;
        return this.f11824b.getInt(i11 + this.f11824b.getInt(i11));
    }
}
