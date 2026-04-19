package t3;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ListView f21247s;

    public c(ListView listView) {
        super(listView);
        this.f21247s = listView;
    }

    @Override // t3.a
    public boolean a(int i10) {
        return false;
    }

    @Override // t3.a
    public boolean b(int i10) {
        ListView listView = this.f21247s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // t3.a
    public void j(int i10, int i11) {
        this.f21247s.scrollListBy(i11);
    }
}
