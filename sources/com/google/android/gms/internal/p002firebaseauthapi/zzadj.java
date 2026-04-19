package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import ca.t;
import com.google.firebase.auth.FirebaseAuth;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import w8.m;
import x9.f;
import z8.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzadj extends AsyncTask<Void, Void, zzadi> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzadl> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final f zzg;

    public zzadj(String str, String str2, Intent intent, f fVar, zzadl zzadlVar) {
        this.zzb = m.e(str);
        this.zzg = (f) m.k(fVar);
        m.e(str2);
        m.k(intent);
        String strE = m.e(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder builderBuildUpon = Uri.parse(zzadlVar.zza(strE)).buildUpon();
        builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter(SubscriberAttributeKt.JSON_NAME_KEY, strE).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) m.k(str2));
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzadlVar);
        this.zze = zzadlVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzadi doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzadl zzadlVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzadlVar.zza(url);
            httpURLConnectionZza.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(60000);
            new zzadu(zzadlVar.zza(), this.zzg, zzads.zza().zzb()).zza(httpURLConnectionZza);
            int responseCode = httpURLConnectionZza.getResponseCode();
            if (responseCode != 200) {
                String strZza = zza(httpURLConnectionZza);
                zza.c(String.format("Error getting project config. Failed with %s %s", strZza, Integer.valueOf(responseCode)), new Object[0]);
                return zzadi.zzb(strZza);
            }
            zzagk zzagkVar = new zzagk();
            zzagkVar.zza(new String(zza(httpURLConnectionZza.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzagkVar.zza().contains(this.zzf) ? zzadi.zzb("UNAUTHORIZED_DOMAIN") : zzadi.zza(this.zzf);
            }
            for (String str : zzagkVar.zza()) {
                if (zza(str)) {
                    return zzadi.zza(str);
                }
            }
            return null;
        } catch (zzabg e10) {
            zza.c("ConversionException encountered: " + e10.getMessage(), new Object[0]);
            return null;
        } catch (IOException e11) {
            zza.c("IOException occurred: " + e11.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e12) {
            zza.c("Null pointer encountered: " + e12.getMessage(), new Object[0]);
            return null;
        }
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                return (String) zzadr.zza(new String(zza(errorStream, 128)), String.class);
            }
            return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
        } catch (IOException e10) {
            zza.h("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e10), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzadi zzadiVar) {
        String strZzb;
        Uri.Builder builder;
        zzadl zzadlVar = this.zzd.get();
        String strZza = null;
        if (zzadiVar != null) {
            strZza = zzadiVar.zza();
            strZzb = zzadiVar.zzb();
        } else {
            strZzb = null;
        }
        if (zzadlVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(strZza) || (builder = this.zze) == null) {
            zzadlVar.zza(this.zzb, t.a(strZzb));
        } else {
            builder.authority(strZza);
            zzadlVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).v0());
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e10) {
            zza.c("Error parsing URL for auth domain check: " + str + ". " + e10.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(zzadi zzadiVar) {
        onPostExecute((zzadi) null);
    }
}
