package com.google.android.recaptcha.internal;

import ae.r;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import le.n0;
import md.i0;
import md.u;
import qd.d;
import sd.j;
import xd.a;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzdp extends j implements p {
    final /* synthetic */ zzdq zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzqt zzc;
    final /* synthetic */ zzdc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdp(zzdq zzdqVar, String str, zzqt zzqtVar, zzdc zzdcVar, d dVar) {
        super(2, dVar);
        this.zza = zzdqVar;
        this.zzb = str;
        this.zzc = zzqtVar;
        this.zzd = zzdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzdp(this.zza, this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdp) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rd.d.e();
        u.b(obj);
        zzdf zzdfVarZzf = this.zzd.zzf(22);
        zzqt zzqtVar = this.zzc;
        String str = this.zzb;
        try {
            if (!zzdt.zzb(str)) {
                throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
            }
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                r.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                String strEncode = URLEncoder.encode(zzqtVar.zzL(), "UTF-8");
                String strEncode2 = URLEncoder.encode(zzqtVar.zzk(), "UTF-8");
                int iZzS = zzqtVar.zzS();
                byte[] bytes = ("k=" + strEncode + "&pk=" + strEncode2 + "&mst=" + URLEncoder.encode(iZzS != 2 ? iZzS != 3 ? iZzS != 4 ? iZzS != 5 ? "UNRECOGNIZED" : "IOS" : "ANDROID_OFFPLAY" : "ANDROID_ONPLAY" : "UNSPECIFIED", "UTF-8") + "&msv=" + URLEncoder.encode(zzqtVar.zzJ(), "UTF-8") + "&msi=" + URLEncoder.encode(zzqtVar.zzK(), "UTF-8") + "&mov=" + zzqtVar.zzj() + "&mkc=" + zzqtVar.zzi()).getBytes(Charset.forName("UTF-8"));
                try {
                    try {
                        zzdr.zza(httpURLConnection);
                        try {
                            zzdr.zzd(httpURLConnection).write(bytes);
                            if (httpURLConnection.getResponseCode() == 200) {
                                try {
                                    zzpq zzpqVarZzi = zzpq.zzi(zzdr.zzc(httpURLConnection));
                                    httpURLConnection.disconnect();
                                    zzdfVarZzf.zza();
                                    return zzpqVarZzi;
                                } catch (Exception unused) {
                                    throw new zzbj(zzbh.zzb, zzbg.zzG, null);
                                }
                            }
                            try {
                                int responseCode = httpURLConnection.getResponseCode();
                                byte[] bArrC = a.c(httpURLConnection.getErrorStream());
                                if (responseCode != 400) {
                                    throw zzdr.zzb(responseCode);
                                }
                                zzrb zzrbVarZzg = zzrb.zzg(bArrC);
                                int i10 = zzbj.zza;
                                throw zzbi.zza(zzrbVarZzg.zzi());
                            } catch (Exception unused2) {
                                throw new zzbj(zzbh.zzc, zzbg.zzai, null);
                            }
                        } catch (IOException e10) {
                            throw new zzbj(zzbh.zzc, zzbg.zzah, e10.getMessage());
                        } catch (Exception e11) {
                            throw new zzbj(zzbh.zzc, zzbg.zzam, e11.getMessage());
                        }
                    } catch (Exception e12) {
                        if (e12 instanceof zzbj) {
                            throw ((zzbj) e12);
                        }
                        throw new zzbj(zzbh.zzc, zzbg.zzF, e12.getMessage());
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Exception e13) {
                throw new zzbj(zzbh.zzc, zzbg.zzaj, e13.getMessage());
            }
        } catch (zzbj e14) {
            zzdfVarZzf.zzb(e14);
            throw e14;
        } catch (Exception e15) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e15.getMessage());
            zzdfVarZzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
