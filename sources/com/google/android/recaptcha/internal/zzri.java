package com.google.android.recaptcha.internal;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zzri extends zzks implements zzly {
    private static final zzri zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzqv zzi;
    private int zzj;
    private zzqq zzk;

    static {
        zzri zzriVar = new zzri();
        zzb = zzriVar;
        zzks.zzF(zzri.class, zzriVar);
    }

    private zzri() {
    }

    static /* synthetic */ void zzK(zzri zzriVar, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzriVar.zze = i10 - 2;
    }

    static /* synthetic */ void zzL(zzri zzriVar, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzriVar.zzg = i10 - 2;
    }

    public static zzrh zzf() {
        return (zzrh) zzb.zzp();
    }

    public final int zzJ() {
        int i10;
        switch (this.zze) {
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
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzri();
        }
        zzqr zzqrVar = null;
        if (i11 == 4) {
            return new zzrh(zzqrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzk() {
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
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                i10 = 41;
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                i10 = 42;
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                i10 = 43;
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                i10 = 44;
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                i10 = 45;
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                i10 = 46;
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                i10 = 47;
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                i10 = 48;
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                i10 = 49;
                break;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                i10 = 50;
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                i10 = 51;
                break;
            case 50:
                i10 = 52;
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                i10 = 53;
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                i10 = 54;
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                i10 = 55;
                break;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                i10 = 56;
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                i10 = 57;
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
