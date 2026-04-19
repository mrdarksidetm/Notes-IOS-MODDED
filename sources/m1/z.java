package m1;

import l1.l0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends c {
    public z(String str, int i10) {
        super(str, b.f15189a.c(), i10, null);
    }

    private final float o(float f10) {
        return ge.o.k(f10, -2.0f, 2.0f);
    }

    @Override // m1.c
    public float[] b(float[] fArr) {
        fArr[0] = o(fArr[0]);
        fArr[1] = o(fArr[1]);
        fArr[2] = o(fArr[2]);
        return fArr;
    }

    @Override // m1.c
    public float e(int i10) {
        return 2.0f;
    }

    @Override // m1.c
    public float f(int i10) {
        return -2.0f;
    }

    @Override // m1.c
    public long j(float f10, float f11, float f12) {
        float fO = o(f10);
        return (((long) Float.floatToRawIntBits(o(f11))) & 4294967295L) | (Float.floatToRawIntBits(fO) << 32);
    }

    @Override // m1.c
    public float[] l(float[] fArr) {
        fArr[0] = o(fArr[0]);
        fArr[1] = o(fArr[1]);
        fArr[2] = o(fArr[2]);
        return fArr;
    }

    @Override // m1.c
    public float m(float f10, float f11, float f12) {
        return o(f12);
    }

    @Override // m1.c
    public long n(float f10, float f11, float f12, float f13, c cVar) {
        return l0.a(o(f10), o(f11), o(f12), f13, cVar);
    }
}
