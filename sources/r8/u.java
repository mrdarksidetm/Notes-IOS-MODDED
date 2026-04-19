package r8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends zbb implements v {
    public u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zbc.zba(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                x(googleSignInAccount, status);
                break;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                B(status2);
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                t(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
