package a6;

import java.util.Set;
import nd.y0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f620a = y0.d("image/jpeg", "image/webp", "image/heic", "image/heif");

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f621a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f621a = iArr;
        }
    }

    public static final boolean a(h hVar) {
        return hVar.a() > 0;
    }

    public static final boolean b(h hVar) {
        return hVar.a() == 90 || hVar.a() == 270;
    }

    public static final boolean c(j jVar, String str) {
        int i10 = a.f621a[jVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return false;
            }
            if (i10 != 3) {
                throw new md.q();
            }
        } else if (str == null || !f620a.contains(str)) {
            return false;
        }
        return true;
    }
}
