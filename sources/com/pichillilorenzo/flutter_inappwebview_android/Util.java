package com.pichillilorenzo.flutter_inappwebview_android;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONArray;
import org.json.JSONObject;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class Util {
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    static final String LOG_TAG = "Util";

    public static class PrivateKeyAndCertificates {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;

        public PrivateKeyAndCertificates(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey;
            this.certificates = x509CertificateArr;
        }
    }

    private Util() {
    }

    public static String JSONStringify(Object obj) {
        return obj == null ? "null" : obj instanceof Map ? new JSONObject((Map) obj).toString() : obj instanceof List ? new JSONArray((Collection) obj).toString() : obj instanceof String ? JSONObject.quote((String) obj) : JSONObject.wrap(obj).toString();
    }

    public static Drawable drawableFromBytes(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static InputStream getFileAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
        return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(inAppWebViewFlutterPlugin.flutterAssets.a(str));
    }

    public static Size2D getFullscreenSize(Context context) {
        int iHeight;
        Size2D size2D = new Size2D(-1.0d, -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets$Type.navigationBars() | WindowInsets$Type.displayCutout());
                int i10 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
                int i11 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
                Rect bounds = currentWindowMetrics.getBounds();
                size2D.setWidth(bounds.width() - i10);
                iHeight = bounds.height() - i11;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                size2D.setWidth(displayMetrics.widthPixels);
                iHeight = displayMetrics.heightPixels;
            }
            size2D.setHeight(iHeight);
        }
        return size2D;
    }

    public static <T> T getOrDefault(Map<String, Object> map, String str, T t10) {
        return map.containsKey(str) ? (T) map.get(str) : t10;
    }

    public static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) throws IOException {
        String strA = inAppWebViewFlutterPlugin.flutterAssets.a(str);
        try {
            InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
            if (fileAsset != null) {
                fileAsset.close();
            }
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        if (e != null) {
            throw e;
        }
        return ANDROID_ASSET_URL + strA;
    }

    public static X509Certificate getX509CertFromSslCertHack(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray == null) {
            return null;
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static <T> T invokeMethodAndWaitResult(final j jVar, final String str, final Object obj, final SyncBaseCallbackResultImpl<T> syncBaseCallbackResultImpl) throws InterruptedException {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.Util.1
            @Override // java.lang.Runnable
            public void run() {
                jVar.d(str, obj, syncBaseCallbackResultImpl);
            }
        });
        syncBaseCallbackResultImpl.latch.await();
        return syncBaseCallbackResultImpl.result;
    }

    public static <O> Object invokeMethodIfExists(O o10, String str, Object... objArr) {
        for (Method method : o10.getClass().getMethods()) {
            if (method.getName().equals(str)) {
                try {
                    return method.invoke(o10, objArr);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean isClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isIPv6(String str) {
        try {
            InetAddress.getByName(str);
            return true;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, String str2, String str3) {
        InputStream fileInputStream;
        try {
            fileInputStream = getFileAsset(inAppWebViewFlutterPlugin, str);
        } catch (IOException unused) {
            fileInputStream = null;
        }
        if (fileInputStream == null) {
            try {
                try {
                    try {
                        fileInputStream = new FileInputStream(str);
                    } catch (Throwable th) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e10) {
                                Log.e(LOG_TAG, "", e10);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    Log.e(LOG_TAG, "", e11);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                }
            } catch (IOException e12) {
                Log.e(LOG_TAG, "", e12);
            }
        }
        KeyStore keyStore = KeyStore.getInstance(str3);
        keyStore.load(fileInputStream, (str2 != null ? str2 : "").toCharArray());
        String strNextElement = keyStore.aliases().nextElement();
        if (str2 == null) {
            str2 = "";
        }
        Key key = keyStore.getKey(strNextElement, str2.toCharArray());
        privateKeyAndCertificates = key instanceof PrivateKey ? new PrivateKeyAndCertificates((PrivateKey) key, new X509Certificate[]{(X509Certificate) keyStore.getCertificate(strNextElement)}) : null;
        fileInputStream.close();
        fileInputStream.close();
        return privateKeyAndCertificates;
    }

    public static void log(String str, String str2) {
        int iMin;
        int length = str2.length();
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str2.indexOf(10, i10);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i10 + 4000);
                Log.d(str, str2.substring(i10, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i10 = iMin;
                }
            }
            i10 = iMin + 1;
        }
    }

    public static HttpURLConnection makeHttpRequest(String str, String str2, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod(str2);
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(true);
                if ("GET".equalsIgnoreCase(str2)) {
                    httpURLConnection.setDoOutput(false);
                }
                httpURLConnection.connect();
                return httpURLConnection;
            } catch (Exception e10) {
                e = e10;
                if (!(e instanceof SSLHandshakeException)) {
                    Log.e(LOG_TAG, "", e);
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            httpURLConnection = null;
        }
    }

    public static String normalizeIPv6(String str) throws Exception {
        if (isIPv6(str)) {
            return InetAddress.getByName(str).getCanonicalHostName();
        }
        throw new Exception("Invalid address: " + str);
    }

    public static boolean objEquals(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:5|(5:6|44|7|(1:9)(1:46)|27)|10|38|11|40|12|27) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] readAllBytes(java.io.InputStream r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
        Ld:
            r4 = 0
            int r5 = r7.read(r2, r4, r1)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L2c
            r6 = -1
            if (r5 == r6) goto L19
            r3.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L2c
            goto Ld
        L19:
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L2c
            r7.close()     // Catch: java.io.IOException -> L20
        L20:
            r3.close()     // Catch: java.io.IOException -> L3d
            goto L3d
        L24:
            r0 = move-exception
            r7.close()     // Catch: java.io.IOException -> L28
        L28:
            r3.close()     // Catch: java.io.IOException -> L2b
        L2b:
            throw r0
        L2c:
            r1 = move-exception
            r7.close()     // Catch: java.io.IOException -> L31
            goto L35
        L31:
            r7 = move-exception
            r1.addSuppressed(r7)
        L35:
            r3.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r7 = move-exception
            r1.addSuppressed(r7)
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.Util.readAllBytes(java.io.InputStream):byte[]");
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.join(str3, str.split(Pattern.quote(str2)));
    }
}
