package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdr {
    public static final void zza(HttpURLConnection httpURLConnection) throws zzbj {
        try {
            httpURLConnection.connect();
        } catch (SocketTimeoutException e10) {
            throw new zzbj(zzbh.zzc, zzbg.zzad, e10.getMessage());
        } catch (IOException e11) {
            throw new zzbj(zzbh.zzc, zzbg.zzae, e11.getMessage());
        } catch (Exception e12) {
            throw new zzbj(zzbh.zzc, zzbg.zzak, e12.getMessage());
        }
    }

    public static final zzbj zzb(int i10) {
        return i10 != 403 ? i10 != 404 ? i10 != 503 ? new zzbj(zzbh.zzb, zzbg.zzK, null) : new zzbj(zzbh.zzi, zzbg.zzJ, null) : new zzbj(zzbh.zzc, zzbg.zzi, null) : new zzbj(zzbh.zzi, zzbg.zzJ, null);
    }

    public static final InputStream zzc(HttpURLConnection httpURLConnection) throws zzbj {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e10) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e11.getMessage());
        }
    }

    public static final OutputStream zzd(HttpURLConnection httpURLConnection) throws zzbj {
        try {
            return httpURLConnection.getOutputStream();
        } catch (IOException e10) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e11.getMessage());
        }
    }
}
