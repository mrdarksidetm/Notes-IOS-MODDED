package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes2.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f12983a;

    public a(FlutterJNI flutterJNI) {
        this.f12983a = flutterJNI;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0134 A[PHI: r2 r4
  0x0134: PHI (r2v2 int) = (r2v1 int), (r2v4 int) binds: [B:58:0x00b9, B:80:0x010f] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:58:0x00b9, B:80:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.CharSequence r10, int r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.a.a(java.lang.CharSequence, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0141 A[PHI: r2 r4
  0x0141: PHI (r2v6 int) = (r2v3 int), (r2v8 int) binds: [B:79:0x010f, B:81:0x011c] A[DONT_GENERATE, DONT_INLINE]
  0x0141: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:79:0x010f, B:81:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(java.lang.CharSequence r9, int r10) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.a.b(java.lang.CharSequence, int):int");
    }

    public boolean c(int i10) {
        return this.f12983a.isCodePointEmoji(i10);
    }

    public boolean d(int i10) {
        return this.f12983a.isCodePointEmojiModifier(i10);
    }

    public boolean e(int i10) {
        return this.f12983a.isCodePointEmojiModifierBase(i10);
    }

    public boolean f(int i10) {
        return (48 <= i10 && i10 <= 57) || i10 == 35 || i10 == 42;
    }

    public boolean g(int i10) {
        return this.f12983a.isCodePointRegionalIndicator(i10);
    }

    public boolean h(int i10) {
        return 917536 <= i10 && i10 <= 917630;
    }

    public boolean i(int i10) {
        return this.f12983a.isCodePointVariantSelector(i10);
    }
}
