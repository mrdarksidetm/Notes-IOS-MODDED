package android.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ContentInfo implements Parcelable {

    public final /* synthetic */ class Builder {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Builder(ClipData clipData, int i10) {
        }

        public native /* synthetic */ ContentInfo build();

        public native /* synthetic */ Builder setExtras(Bundle bundle);

        public native /* synthetic */ Builder setFlags(int i10);

        public native /* synthetic */ Builder setLinkUri(Uri uri);
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ ClipData getClip();

    public native /* synthetic */ int getFlags();

    public native /* synthetic */ int getSource();
}
