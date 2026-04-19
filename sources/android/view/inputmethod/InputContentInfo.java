package android.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InputContentInfo implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ InputContentInfo(Uri uri, ClipDescription clipDescription, Uri uri2) {
    }

    public native /* synthetic */ Uri getContentUri();

    public native /* synthetic */ ClipDescription getDescription();

    public native /* synthetic */ Uri getLinkUri();

    public native /* synthetic */ void releasePermission();

    public native /* synthetic */ void requestPermission();
}
