package com.google.android.recaptcha.internal;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zzop extends zzks implements zzly {
    private static final zzop zzb;
    private int zzd;
    private Object zzf;
    private int zzg;
    private long zzl;
    private zzka zzm;
    private int zzn;
    private zzod zzo;
    private zzpb zzp;
    private zzmz zzr;
    private zzka zzs;
    private int zzu;
    private int zze = 0;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private zzkx zzt = zzks.zzw();

    static {
        zzop zzopVar = new zzop();
        zzb = zzopVar;
        zzks.zzF(zzop.class, zzopVar);
    }

    private zzop() {
    }

    public static zzop zzJ(byte[] bArr) {
        return (zzop) zzks.zzv(zzb, bArr);
    }

    static /* synthetic */ void zzO(zzop zzopVar, zzod zzodVar) {
        zzopVar.zzo = zzodVar;
        zzopVar.zzd |= 2;
    }

    static /* synthetic */ void zzP(zzop zzopVar, zzpb zzpbVar) {
        zzpbVar.getClass();
        zzopVar.zzp = zzpbVar;
        zzopVar.zzd |= 4;
    }

    static /* synthetic */ void zzR(zzop zzopVar, int i10) {
        zzkx zzkxVar = zzopVar.zzt;
        if (!zzkxVar.zzc()) {
            zzopVar.zzt = zzks.zzx(zzkxVar);
        }
        zzopVar.zzt.zzh(0);
    }

    static /* synthetic */ void zzS(zzop zzopVar, int i10) {
        zzopVar.zzd |= 32;
        zzopVar.zzu = i10;
    }

    static /* synthetic */ void zzT(zzop zzopVar, String str) {
        str.getClass();
        zzopVar.zzh = str;
    }

    static /* synthetic */ void zzU(zzop zzopVar, String str) {
        str.getClass();
        zzopVar.zzi = str;
    }

    public static zzoo zzi() {
        return (zzoo) zzb.zzp();
    }

    public static zzop zzk() {
        return zzb;
    }

    public final String zzK() {
        return this.zzi;
    }

    public final String zzL() {
        return this.zzj;
    }

    public final boolean zzV() {
        return (this.zzd & 2) != 0;
    }

    public final int zzW() {
        int i10;
        switch (this.zzg) {
            case 0:
                i10 = 2;
                break;
            case 1:
                i10 = 3;
                break;
            case 2:
                i10 = 4;
                break;
            case 3:
                i10 = 5;
                break;
            case 4:
                i10 = 6;
                break;
            case 5:
                i10 = 7;
                break;
            case 6:
                i10 = 8;
                break;
            case 7:
                i10 = 9;
                break;
            case 8:
                i10 = 10;
                break;
            case 9:
                i10 = 11;
                break;
            case 10:
                i10 = 12;
                break;
            case 11:
                i10 = 13;
                break;
            case 12:
                i10 = 14;
                break;
            case 13:
                i10 = 15;
                break;
            case 14:
                i10 = 16;
                break;
            case 15:
                i10 = 17;
                break;
            case 16:
                i10 = 18;
                break;
            case 17:
                i10 = 19;
                break;
            case 18:
                i10 = 20;
                break;
            case 19:
                i10 = 21;
                break;
            case 20:
                i10 = 22;
                break;
            case 21:
                i10 = 23;
                break;
            case 22:
                i10 = 24;
                break;
            case 23:
                i10 = 25;
                break;
            case 24:
                i10 = 26;
                break;
            case 25:
                i10 = 27;
                break;
            case 26:
                i10 = 28;
                break;
            case 27:
                i10 = 29;
                break;
            case 28:
                i10 = 30;
                break;
            case 29:
                i10 = 31;
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                i10 = 32;
                break;
            case 31:
                i10 = 33;
                break;
            case 32:
                i10 = 34;
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                i10 = 35;
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                i10 = 36;
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                i10 = 37;
                break;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                i10 = 38;
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                i10 = 39;
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                i10 = 40;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzX() {
        int i10 = this.zzn;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Deprecated
    public final long zzf() {
        return this.zzl;
    }

    public final zzod zzg() {
        zzod zzodVar = this.zzo;
        return zzodVar == null ? zzod.zzj() : zzodVar;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0010\u0001\u0001\u0001\u0012\u0010\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005", new Object[]{"zzf", "zze", "zzd", "zzg", "zzi", "zzl", "zzn", "zzo", "zzp", "zzq", "zzj", "zzk", "zzm", "zzr", "zzs", "zzh", zznw.class, "zzt", "zzu"});
        }
        if (i11 == 3) {
            return new zzop();
        }
        zzon zzonVar = null;
        if (i11 == 4) {
            return new zzoo(zzonVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
