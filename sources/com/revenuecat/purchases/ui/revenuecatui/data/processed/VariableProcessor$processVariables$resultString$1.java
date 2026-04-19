package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.r;
import ae.s;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import java.util.Locale;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class VariableProcessor$processVariables$resultString$1 extends s implements l<String, String> {
    final /* synthetic */ VariableProcessor.PackageContext $context;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ Package $rcPackage;
    final /* synthetic */ VariableDataProvider $variableDataProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariableProcessor$processVariables$resultString$1(VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r32, Locale locale) {
        super(1);
        this.$variableDataProvider = variableDataProvider;
        this.$context = packageContext;
        this.$rcPackage = r32;
        this.$locale = locale;
    }

    @Override // zd.l
    public final String invoke(String str) {
        r.f(str, "variable");
        return VariableProcessor.INSTANCE.variableValue(this.$variableDataProvider, this.$context, str, this.$rcPackage, this.$locale);
    }
}
