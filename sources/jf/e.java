package jf;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f14260a = {71, 73};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f14261b = {137, 80};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f14262c = {255, 216};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f14263d = {66, 77};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f14264e = {77, 77};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f14265f = {73, 73};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f14266g = {80, 55};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f14267h = {56, 66};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f14268i = {80, 49};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f14269j = {80, 52};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f14270k = {80, 50};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f14271l = {80, 53};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f14272m = {80, 51};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f14273n = {80, 54};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f14274o = {151, 74};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f14275p = {66, 50};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f14276q = {R.styleable.AppCompatTheme_textAppearanceListItemSmall, 99};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f14277r = {177, R.styleable.AppCompatTheme_textAppearanceListItemSecondary};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f14278s = {35, 63};

    private static boolean c(int[] iArr, int[] iArr2) {
        if (iArr.length == 2 || iArr2.length == 2) {
            return iArr[0] == iArr2[0] && iArr[1] == iArr2[1];
        }
        throw new IllegalArgumentException("Invalid Byte Pair.");
    }

    public static a d(final kf.a aVar) throws IOException {
        if (aVar == null) {
            return b.UNKNOWN;
        }
        InputStream inputStreamB = aVar.b();
        try {
            int i10 = inputStreamB.read();
            int i11 = inputStreamB.read();
            if (i10 < 0 || i11 < 0) {
                throw new IllegalArgumentException("Couldn't read magic numbers to guess format.");
            }
            int[] iArr = {i10 & 255, i11 & 255};
            if (c(f14260a, iArr)) {
                b bVar = b.GIF;
                inputStreamB.close();
                return bVar;
            }
            if (c(f14261b, iArr)) {
                b bVar2 = b.PNG;
                inputStreamB.close();
                return bVar2;
            }
            if (c(f14262c, iArr)) {
                b bVar3 = b.JPEG;
                inputStreamB.close();
                return bVar3;
            }
            if (c(f14263d, iArr)) {
                b bVar4 = b.BMP;
                inputStreamB.close();
                return bVar4;
            }
            if (c(f14264e, iArr)) {
                b bVar5 = b.TIFF;
                inputStreamB.close();
                return bVar5;
            }
            if (c(f14265f, iArr)) {
                b bVar6 = b.TIFF;
                inputStreamB.close();
                return bVar6;
            }
            if (c(f14267h, iArr)) {
                b bVar7 = b.PSD;
                inputStreamB.close();
                return bVar7;
            }
            if (c(f14266g, iArr)) {
                b bVar8 = b.PAM;
                inputStreamB.close();
                return bVar8;
            }
            if (c(f14268i, iArr)) {
                b bVar9 = b.PBM;
                inputStreamB.close();
                return bVar9;
            }
            if (c(f14269j, iArr)) {
                b bVar10 = b.PBM;
                inputStreamB.close();
                return bVar10;
            }
            if (c(f14270k, iArr)) {
                b bVar11 = b.PGM;
                inputStreamB.close();
                return bVar11;
            }
            if (c(f14271l, iArr)) {
                b bVar12 = b.PGM;
                inputStreamB.close();
                return bVar12;
            }
            if (c(f14272m, iArr)) {
                b bVar13 = b.PPM;
                inputStreamB.close();
                return bVar13;
            }
            if (c(f14273n, iArr)) {
                b bVar14 = b.PPM;
                inputStreamB.close();
                return bVar14;
            }
            if (c(f14274o, iArr)) {
                int i12 = inputStreamB.read();
                int i13 = inputStreamB.read();
                if (i12 < 0 || i13 < 0) {
                    throw new IllegalArgumentException("Couldn't read magic numbers to guess format.");
                }
                if (c(f14275p, new int[]{i12 & 255, i13 & 255})) {
                    b bVar15 = b.JBIG2;
                    inputStreamB.close();
                    return bVar15;
                }
            } else {
                if (c(f14276q, iArr)) {
                    b bVar16 = b.ICNS;
                    inputStreamB.close();
                    return bVar16;
                }
                if (c(f14277r, iArr)) {
                    b bVar17 = b.DCX;
                    inputStreamB.close();
                    return bVar17;
                }
                if (c(f14278s, iArr)) {
                    b bVar18 = b.RGBE;
                    inputStreamB.close();
                    return bVar18;
                }
            }
            a aVar2 = (a) Stream.of((Object[]) b.values()).filter(new Predicate() { // from class: jf.c
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return e.g(aVar, (b) obj);
                }
            }).findFirst().orElse(b.UNKNOWN);
            inputStreamB.close();
            return aVar2;
        } catch (Throwable th) {
            if (inputStreamB != null) {
                try {
                    inputStreamB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static a e(byte[] bArr) {
        return d(new kf.b(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean f(kf.a aVar, String str) {
        String strA = aVar.a();
        if (strA == null || strA.trim().length() == 0) {
            return false;
        }
        return str != null && str.trim().length() > 0 && strA.substring(strA.lastIndexOf(46) + 1).equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(final kf.a aVar, b bVar) {
        return Stream.of((Object[]) bVar.b()).anyMatch(new Predicate() { // from class: jf.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return e.f(aVar, (String) obj);
            }
        });
    }
}
