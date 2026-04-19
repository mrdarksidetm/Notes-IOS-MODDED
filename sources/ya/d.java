package ya;

import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements Parcelable {

    public static abstract class a implements Parcelable {
        public abstract Uri a();
    }

    public static abstract class b implements Parcelable {
        public abstract int a();

        public abstract Uri b();
    }

    public static d d(List list, Uri uri, int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new k((Uri) it.next()));
        }
        return new i(arrayList, uri != null ? new m(uri, i10) : null);
    }

    public abstract List<a> a();

    public abstract b b();
}
