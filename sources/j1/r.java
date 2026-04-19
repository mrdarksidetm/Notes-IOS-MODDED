package j1;

import a2.e1;
import a2.f0;
import a2.u0;
import androidx.compose.ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final s b(FocusTargetNode focusTargetNode) {
        f0 f0VarY1;
        e1 e1VarJ0;
        i focusOwner;
        u0 u0VarZ1 = focusTargetNode.L0().z1();
        if (u0VarZ1 == null || (f0VarY1 = u0VarZ1.Y1()) == null || (e1VarJ0 = f0VarY1.j0()) == null || (focusOwner = e1VarJ0.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.h();
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        a2.k.l(focusTargetNode).getFocusOwner().b(focusTargetNode);
    }

    public static final s d(FocusTargetNode focusTargetNode) {
        return a2.k.l(focusTargetNode).getFocusOwner().h();
    }
}
