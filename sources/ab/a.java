package ab;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import jc.a;
import sc.b;
import sc.c;

/* JADX INFO: loaded from: classes2.dex */
public class a implements jc.a, kc.a, c.d, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.b f682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f684c;

    private void c(b bVar) {
        new c(bVar, "flutter_keyboard_visibility").d(this);
    }

    private void d(Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.content);
        this.f683b = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private void e() {
        View view = this.f683b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f683b = null;
        }
    }

    @Override // sc.c.d
    public void a(Object obj, c.b bVar) {
        this.f682a = bVar;
    }

    @Override // sc.c.d
    public void b(Object obj) {
        this.f682a = null;
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        d(cVar.getActivity());
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        c(bVar.b());
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        e();
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        e();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f683b != null) {
            Rect rect = new Rect();
            this.f683b.getWindowVisibleDisplayFrame(rect);
            ?? r02 = ((double) rect.height()) / ((double) this.f683b.getRootView().getHeight()) < 0.85d ? 1 : 0;
            if (r02 != this.f684c) {
                this.f684c = r02;
                c.b bVar = this.f682a;
                if (bVar != null) {
                    bVar.success(Integer.valueOf((int) r02));
                }
            }
        }
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        d(cVar.getActivity());
    }
}
