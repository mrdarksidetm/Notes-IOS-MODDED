package com.google.android.recaptcha.internal;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrs extends zzks implements zzly {
    private static final zzrs zzb;
    private int zzd;
    private int zze;
    private zzkz zzf = zzks.zzz();

    static {
        zzrs zzrsVar = new zzrs();
        zzb = zzrsVar;
        zzks.zzF(zzrs.class, zzrsVar);
        zzjk zzjkVarZzg = zzjk.zzg();
        zznm zznmVar = zznm.zzi;
        zzks.zzr(zzjkVarZzg, "", null, null, 490775251, zznmVar, String.class);
        zzks.zzr(zzjk.zzg(), "", null, null, 490775252, zznmVar, String.class);
    }

    private zzrs() {
    }

    public final int zzf() {
        return this.zzd;
    }

    public final int zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zzd", "zze", "zzf", zzrr.class});
        }
        if (i11 == 3) {
            return new zzrs();
        }
        zzqr zzqrVar = null;
        if (i11 == 4) {
            return new zzrp(zzqrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzj() {
        return this.zzf;
    }

    public final int zzk() {
        int i10;
        switch (this.zzd) {
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
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                i10 = 41;
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                i10 = 42;
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                i10 = 43;
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
}
