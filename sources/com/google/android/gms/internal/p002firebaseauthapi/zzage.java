package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import ba.n1;
import ba.x1;
import java.util.ArrayList;
import java.util.List;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzage {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzagu zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private x1 zzk;
    private List<zzags> zzl;
    private zzal<n1> zzm;

    public zzage() {
        this.zzf = new zzagu();
        this.zzm = zzal.zzh();
    }

    public zzage(String str, String str2, boolean z10, String str3, String str4, zzagu zzaguVar, String str5, String str6, long j10, long j11, boolean z11, x1 x1Var, List<zzags> list, zzal<n1> zzalVar) {
        zzagu zzaguVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        if (zzaguVar == null) {
            zzaguVar2 = new zzagu();
        } else {
            List<zzagr> listZza = zzaguVar.zza();
            zzagu zzaguVar3 = new zzagu();
            if (listZza != null) {
                zzaguVar3.zza().addAll(listZza);
            }
            zzaguVar2 = zzaguVar3;
        }
        this.zzf = zzaguVar2;
        this.zzg = str6;
        this.zzh = j10;
        this.zzi = j11;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzalVar;
    }

    public final long zza() {
        return this.zzh;
    }

    public final zzage zza(x1 x1Var) {
        this.zzk = x1Var;
        return this;
    }

    public final zzage zza(zzal<n1> zzalVar) {
        m.k(zzalVar);
        this.zzm = zzalVar;
        return this;
    }

    public final zzage zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzage zza(List<zzagr> list) {
        m.k(list);
        zzagu zzaguVar = new zzagu();
        this.zzf = zzaguVar;
        zzaguVar.zza().addAll(list);
        return this;
    }

    public final zzage zza(boolean z10) {
        this.zzj = z10;
        return this;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final zzage zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzage zzc(String str) {
        this.zze = str;
        return this;
    }

    public final zzal<n1> zzd() {
        return this.zzm;
    }

    public final x1 zze() {
        return this.zzk;
    }

    public final zzagu zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzags> zzk() {
        return this.zzl;
    }

    public final List<zzagr> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }
}
