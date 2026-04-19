package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import n3.g;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f3313k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f3315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f3316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f3317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f3320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f3321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3323j;

    static class a {
        static IconCompat a(Object obj) {
            g.h(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.h(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.e(e(obj));
            }
            if (iD == 6) {
                return IconCompat.c(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f3315b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int d(Object obj) {
            StringBuilder sb2;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (NoSuchMethodException e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (InvocationTargetException e12) {
                e = e12;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r0 >= 26) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static android.graphics.drawable.Icon g(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3314a = -1;
        this.f3316c = null;
        this.f3317d = null;
        this.f3318e = 0;
        this.f3319f = 0;
        this.f3320g = null;
        this.f3321h = f3313k;
        this.f3322i = null;
    }

    IconCompat(int i10) {
        this.f3316c = null;
        this.f3317d = null;
        this.f3318e = 0;
        this.f3319f = 0;
        this.f3320g = null;
        this.f3321h = f3313k;
        this.f3322i = null;
        this.f3314a = i10;
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    static Bitmap b(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat c(Uri uri) {
        n3.c.c(uri);
        return d(uri.toString());
    }

    public static IconCompat d(String str) {
        n3.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3315b = str;
        return iconCompat;
    }

    public static IconCompat e(Uri uri) {
        n3.c.c(uri);
        return f(uri.toString());
    }

    public static IconCompat f(String str) {
        n3.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3315b = str;
        return iconCompat;
    }

    public static IconCompat g(Context context, int i10) {
        n3.c.c(context);
        return h(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat h(Resources resources, String str, int i10) {
        n3.c.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3318e = i10;
        if (resources != null) {
            try {
                iconCompat.f3315b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3315b = str;
        }
        iconCompat.f3323j = str;
        return iconCompat;
    }

    private static String s(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int i() {
        int i10 = this.f3314a;
        if (i10 == -1) {
            return a.b(this.f3315b);
        }
        if (i10 == 2) {
            return this.f3318e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String j() {
        int i10 = this.f3314a;
        if (i10 == -1) {
            return a.c(this.f3315b);
        }
        if (i10 == 2) {
            String str = this.f3323j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3315b).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0] : this.f3323j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int k() {
        int i10 = this.f3314a;
        return i10 == -1 ? a.d(this.f3315b) : i10;
    }

    public Uri l() {
        int i10 = this.f3314a;
        if (i10 == -1) {
            return a.e(this.f3315b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f3315b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream m(Context context) {
        StringBuilder sb2;
        String str;
        Uri uriL = l();
        String scheme = uriL.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriL);
            } catch (Exception e10) {
                e = e10;
                sb2 = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3315b));
            } catch (FileNotFoundException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb2.append(str);
        sb2.append(uriL);
        Log.w("IconCompat", sb2.toString(), e);
        return null;
    }

    public void n() {
        Parcelable parcelable;
        this.f3321h = PorterDuff.Mode.valueOf(this.f3322i);
        switch (this.f3314a) {
            case -1:
                parcelable = this.f3317d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f3317d;
                if (parcelable == null) {
                    byte[] bArr = this.f3316c;
                    this.f3315b = bArr;
                    this.f3314a = 3;
                    this.f3318e = 0;
                    this.f3319f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3316c, Charset.forName("UTF-16"));
                this.f3315b = str;
                if (this.f3314a == 2 && this.f3323j == null) {
                    this.f3323j = str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3315b = this.f3316c;
                return;
        }
        this.f3315b = parcelable;
    }

    public void o(boolean z10) {
        this.f3322i = this.f3321h.name();
        switch (this.f3314a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    Bitmap bitmap = (Bitmap) this.f3315b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3316c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f3316c = ((String) this.f3315b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3316c = (byte[]) this.f3315b;
                return;
            case 4:
            case 6:
                this.f3316c = this.f3315b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f3317d = (Parcelable) this.f3315b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle p() {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.f3314a
            java.lang.String r2 = "obj"
            switch(r1) {
                case -1: goto L29;
                case 0: goto Lc;
                case 1: goto L24;
                case 2: goto L1c;
                case 3: goto L14;
                case 4: goto L1c;
                case 5: goto L24;
                case 6: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.Object r1 = r3.f3315b
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L30
        L1c:
            java.lang.Object r1 = r3.f3315b
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L30
        L24:
            java.lang.Object r1 = r3.f3315b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L2d
        L29:
            java.lang.Object r1 = r3.f3315b
            android.os.Parcelable r1 = (android.os.Parcelable) r1
        L2d:
            r0.putParcelable(r2, r1)
        L30:
            int r1 = r3.f3314a
            java.lang.String r2 = "type"
            r0.putInt(r2, r1)
            int r1 = r3.f3318e
            java.lang.String r2 = "int1"
            r0.putInt(r2, r1)
            int r1 = r3.f3319f
            java.lang.String r2 = "int2"
            r0.putInt(r2, r1)
            java.lang.String r1 = r3.f3323j
            java.lang.String r2 = "string1"
            r0.putString(r2, r1)
            android.content.res.ColorStateList r1 = r3.f3320g
            if (r1 == 0) goto L55
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L55:
            android.graphics.PorterDuff$Mode r1 = r3.f3321h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f3313k
            if (r1 == r2) goto L64
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "tint_mode"
            r0.putString(r2, r1)
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.p():android.os.Bundle");
    }

    @Deprecated
    public Icon q() {
        return r(null);
    }

    public Icon r(Context context) {
        return a.g(this, context);
    }

    public String toString() {
        int height;
        if (this.f3314a == -1) {
            return String.valueOf(this.f3315b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(s(this.f3314a));
        switch (this.f3314a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f3315b).getWidth());
                sb2.append("x");
                height = ((Bitmap) this.f3315b).getHeight();
                sb2.append(height);
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f3323j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(i())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f3318e);
                if (this.f3319f != 0) {
                    sb2.append(" off=");
                    height = this.f3319f;
                    sb2.append(height);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f3315b);
                break;
        }
        if (this.f3320g != null) {
            sb2.append(" tint=");
            sb2.append(this.f3320g);
        }
        if (this.f3321h != f3313k) {
            sb2.append(" mode=");
            sb2.append(this.f3321h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
