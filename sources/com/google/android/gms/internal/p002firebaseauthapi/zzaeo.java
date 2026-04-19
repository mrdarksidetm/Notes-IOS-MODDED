package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzaeo {
    public static void zza(String str, zzadq zzadqVar, zzael<?> zzaelVar, Type type, zzadu zzaduVar) {
        String message;
        try {
            m.k(zzadqVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzadqVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaduVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzaelVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (NullPointerException e10) {
            e = e10;
            message = e.getMessage();
            zzaelVar.zza(message);
        } catch (SocketTimeoutException unused) {
            message = "TIMEOUT";
            zzaelVar.zza(message);
        } catch (UnknownHostException unused2) {
            message = "<<Network Error>>";
            zzaelVar.zza(message);
        } catch (IOException e11) {
            e = e11;
            message = e.getMessage();
            zzaelVar.zza(message);
        } catch (JSONException e12) {
            e = e12;
            message = e.getMessage();
            zzaelVar.zza(message);
        }
    }

    public static void zza(String str, zzael<?> zzaelVar, Type type, zzadu zzaduVar) {
        String message;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaduVar.zza(httpURLConnection);
            zza(httpURLConnection, zzaelVar, type);
        } catch (SocketTimeoutException unused) {
            message = "TIMEOUT";
            zzaelVar.zza(message);
        } catch (UnknownHostException unused2) {
            message = "<<Network Error>>";
            zzaelVar.zza(message);
        } catch (IOException e10) {
            message = e10.getMessage();
            zzaelVar.zza(message);
        }
    }

    private static void zza(HttpURLConnection httpURLConnection, zzael<?> zzaelVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String string = sb2.toString();
                if (zza(responseCode)) {
                    zzaelVar.zza((zzadt) zzadr.zza(string, type));
                } else {
                    zzaelVar.zza((String) zzadr.zza(string, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzabg e10) {
                e = e10;
                zzaelVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzaelVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e11) {
                e = e11;
                zzaelVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    private static final boolean zza(int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
