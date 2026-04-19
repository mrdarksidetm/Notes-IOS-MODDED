package tf;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f21413a = 4;

    public static int a(int i10) {
        return 4 - (i10 % 4);
    }

    public static int b(char c10, CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static int d(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != ' ') {
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i10;
                }
            }
            i10++;
        }
        return -1;
    }

    public static boolean e(CharSequence charSequence) {
        int length = charSequence.length();
        return m(' ', charSequence, 0, length) != length;
    }

    public static boolean f(CharSequence charSequence) {
        return d(charSequence, 0) == -1;
    }

    public static boolean g(char c10) {
        switch (c10) {
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                return true;
            default:
                switch (c10) {
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        return true;
                    default:
                        switch (c10) {
                            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                                return true;
                            default:
                                switch (c10) {
                                    case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean h(CharSequence charSequence, int i10) {
        return Character.isLetter(Character.codePointAt(charSequence, i10));
    }

    public static boolean i(int i10) {
        int type = Character.getType(i10);
        if (type != 29 && type != 30) {
            switch (type) {
                default:
                    if (i10 != 36 && i10 != 43 && i10 != 94 && i10 != 96 && i10 != 124 && i10 != 126) {
                        switch (i10) {
                            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                break;
                            default:
                                return false;
                        }
                    }
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    return true;
            }
        }
        return true;
    }

    public static boolean j(CharSequence charSequence, int i10) {
        if (i10 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i10);
        return cCharAt == '\t' || cCharAt == ' ';
    }

    public static boolean k(int i10) {
        return i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32 || Character.getType(i10) == 12;
    }

    public static CharSequence l(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                }
                cCharAt = 65533;
            } else {
                if (sb2 != null) {
                }
            }
            sb2.append(cCharAt);
        }
        return sb2 != null ? sb2.toString() : charSequence;
    }

    public static int m(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int n(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }

    public static int o(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int p(CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }
}
