package g3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l3.g;

/* JADX INFO: loaded from: classes.dex */
class c extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class<?> f11426b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Constructor<?> f11427c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f11428d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f11429e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f11430f = false;

    c() {
    }

    private static boolean h(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        k();
        try {
            return ((Boolean) f11428d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface i(Object obj) throws NoSuchMethodException {
        k();
        try {
            Object objNewInstance = Array.newInstance(f11426b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f11429e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f11430f) {
            return;
        }
        f11430f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f11427c = constructor;
        f11426b = cls;
        f11428d = method2;
        f11429e = method;
    }

    private static Object l() throws NoSuchMethodException {
        k();
        try {
            return f11427c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // g3.h
    public Typeface a(Context context, a.c cVar, Resources resources, int i10) throws NoSuchMethodException {
        Object objL = l();
        for (a.d dVar : cVar.a()) {
            File fileE = i.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!i.c(fileE, resources, dVar.b())) {
                    return null;
                }
                if (!h(objL, fileE.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return i(objL);
    }

    @Override // g3.h
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        if (bVarArr.length < 1) {
            return null;
        }
        g.b bVarG = g(bVarArr, i10);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileJ = j(parcelFileDescriptorOpenFileDescriptor);
                if (fileJ != null && fileJ.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileJ);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceC = super.c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceC;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
