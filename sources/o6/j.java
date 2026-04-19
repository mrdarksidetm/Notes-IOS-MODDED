package o6;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import b6.a;
import com.google.android.gms.common.api.a;
import e6.b;
import java.io.Closeable;
import java.io.File;
import je.v;
import je.w;
import k6.c;
import nd.c0;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Bitmap.Config[] f16382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Bitmap.Config f16383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Headers f16384c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f16387c;

        static {
            int[] iArr = new int[a6.d.values().length];
            try {
                iArr[a6.d.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a6.d.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a6.d.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a6.d.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16385a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f16386b = iArr2;
            int[] iArr3 = new int[k6.h.values().length];
            try {
                iArr3[k6.h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[k6.h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f16387c = iArr3;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f16382a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f16383b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f16384c = new Headers.Builder().e();
    }

    public static final int A(String str, int i10) {
        Long lN = je.u.n(str);
        if (lN == null) {
            return i10;
        }
        long jLongValue = lN.longValue();
        if (jLongValue > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final int B(k6.c cVar, k6.h hVar) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f14405a;
        }
        int i10 = a.f16387c[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return a.e.API_PRIORITY_OTHER;
        }
        throw new md.q();
    }

    public static final void a(a.b bVar) {
        try {
            bVar.a();
        } catch (Exception unused) {
        }
    }

    public static final Headers.Builder b(Headers.Builder builder, String str) {
        int iX = w.X(str, ':', 0, false, 6, null);
        if (!(iX != -1)) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iX);
        ae.r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String string = w.W0(strSubstring).toString();
        String strSubstring2 = str.substring(iX + 1);
        ae.r.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        builder.d(string, strSubstring2);
        return builder;
    }

    public static final int c(Context context, double d10) {
        int largeMemoryClass;
        try {
            Object systemService = androidx.core.content.a.getSystemService(context, ActivityManager.class);
            ae.r.c(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        double d11 = 1024;
        return (int) (d10 * ((double) largeMemoryClass) * d11 * d11);
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double e(Context context) {
        try {
            Object systemService = androidx.core.content.a.getSystemService(context, ActivityManager.class);
            ae.r.c(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config f() {
        return f16383b;
    }

    public static final String g(a6.d dVar) {
        int i10 = a.f16385a[dVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return "🧠";
        }
        if (i10 == 3) {
            return "💾";
        }
        if (i10 == 4) {
            return "☁️ ";
        }
        throw new md.q();
    }

    public static final x5.c h(b.a aVar) {
        return aVar instanceof e6.c ? ((e6.c) aVar).f() : x5.c.f22990b;
    }

    public static final String i(Uri uri) {
        return (String) c0.a0(uri.getPathSegments());
    }

    public static final int j(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final String k(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || v.v(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(w.O0(w.P0(w.V0(w.V0(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), com.amazon.a.a.o.c.a.b.f7490a, ""));
    }

    public static final int l(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final j6.u m(View view) {
        int i10 = y5.a.f23363a;
        Object tag = view.getTag(i10);
        j6.u uVar = tag instanceof j6.u ? (j6.u) tag : null;
        if (uVar == null) {
            synchronized (view) {
                Object tag2 = view.getTag(i10);
                j6.u uVar2 = tag2 instanceof j6.u ? (j6.u) tag2 : null;
                if (uVar2 != null) {
                    uVar = uVar2;
                } else {
                    uVar = new j6.u(view);
                    view.addOnAttachStateChangeListener(uVar);
                    view.setTag(i10, uVar);
                }
            }
        }
        return uVar;
    }

    public static final File n(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null".toString());
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final k6.h o(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f16386b[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? k6.h.FIT : k6.h.FILL;
    }

    public static final Bitmap.Config[] p() {
        return f16382a;
    }

    public static final int q(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean r(Uri uri) {
        return ae.r.b(uri.getScheme(), "file") && ae.r.b(i(uri), "android_asset");
    }

    public static final boolean s() {
        return ae.r.b(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean t(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean u(b.a aVar) {
        return (aVar instanceof e6.c) && ((e6.c) aVar).g();
    }

    public static final boolean v(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof d5.c);
    }

    public static final j6.n w(j6.n nVar) {
        return nVar == null ? j6.n.f14046c : nVar;
    }

    public static final j6.r x(j6.r rVar) {
        return rVar == null ? j6.r.f14062c : rVar;
    }

    public static final Headers y(Headers headers) {
        return headers == null ? f16384c : headers;
    }

    public static final ResponseBody z(Response response) {
        ResponseBody responseBodyA = response.a();
        if (responseBodyA != null) {
            return responseBodyA;
        }
        throw new IllegalStateException("response body == null".toString());
    }
}
