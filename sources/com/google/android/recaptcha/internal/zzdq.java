package com.google.android.recaptcha.internal;

import ae.r;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import je.v;
import le.o0;
import qd.d;
import xd.n;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdq {
    private final zzav zza;

    public zzdq(zzav zzavVar, zzdo zzdoVar) {
        this.zza = zzavVar;
    }

    public final Object zza(String str, zzqt zzqtVar, zzdc zzdcVar, d dVar) {
        return o0.e(new zzdp(this, str, zzqtVar, zzdcVar, null), dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final String zzb(zzpq zzpqVar, zzdc zzdcVar) throws Exception {
        String strD;
        zzdf zzdfVar;
        try {
            String strZzJ = zzpqVar.zzJ();
            String strZzK = zzpqVar.zzK();
            boolean zZzd = this.zza.zzd(strZzK);
            ?? r42 = zZzd;
            if (zZzd) {
                zzdf zzdfVarZzf = zzdcVar.zzf(25);
                try {
                    strD = this.zza.zza(strZzK);
                    if (strD != null) {
                        zzdfVarZzf.zza();
                        zzdfVar = zzdfVarZzf;
                    }
                } catch (Exception unused) {
                    zzdfVarZzf.zzb(new zzbj(zzbh.zzk, zzbg.zzR, null));
                }
                zzdfVarZzf.zzb(new zzbj(zzbh.zzk, zzbg.zzS, null));
                r42 = zzdfVarZzf;
                strD = null;
                zzdfVar = r42;
            } else {
                strD = null;
                zzdfVar = r42;
            }
            if (strD == null) {
                try {
                    this.zza.zzb();
                    zzdf zzdfVarZzf2 = zzdcVar.zzf(23);
                    try {
                        try {
                            URLConnection uRLConnectionOpenConnection = new URL(strZzJ).openConnection();
                            r.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                            httpURLConnection.connect();
                            if (httpURLConnection.getResponseCode() != 200) {
                                throw new zzbj(zzbh.zzc, new zzbg(httpURLConnection.getResponseCode()), null);
                            }
                            try {
                                strD = n.d(r.b("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                                zzdfVarZzf2.zza();
                                zzdf zzdfVarZzf3 = zzdcVar.zzf(24);
                                try {
                                    this.zza.zzc(strZzK, strD);
                                    zzdfVarZzf3.zza();
                                } catch (Exception unused2) {
                                    zzdfVarZzf3.zzb(new zzbj(zzbh.zzk, zzbg.zzT, null));
                                }
                            } catch (Exception unused3) {
                                throw new zzbj(zzbh.zzc, zzbg.zzP, null);
                            }
                        } catch (Exception unused4) {
                            throw new zzbj(zzbh.zzc, zzbg.zzO, null);
                        }
                    } catch (Exception unused5) {
                        throw new zzbj(zzbh.zzb, zzbg.zzN, null);
                    }
                } catch (zzbj e10) {
                    zzdfVar.zzb(e10);
                    throw e10;
                }
            }
            return v.C(zzpqVar.zzk(), "JAVASCRIPT_TAG", strD, false, 4, null);
        } catch (Exception e11) {
            if (e11 instanceof zzbj) {
                throw e11;
            }
            throw new zzbj(zzbh.zzb, zzbg.zzL, null);
        }
    }
}
