var elForm, elSelectPackage, elPackageHint, elTerms, elTermsHint;
elForm = document.getElementById('formSigup');
elSelectPackage = document.getElementById('package');
elPackageHint = document.getElementById('packageHint');
elTerms = document.getElementById('terms');
elTermsHint = document.getElementById('termsHint');

function packageHint() {
    var  = this.options[this.selectedIndex].value;
    if (pack === 'monthly')  {
        elPackageHint.innerHTML = 'Save $10 if you pay for 1 year!';
    } else {
        elPackageHint.innerHTML = 'Wise choice!';
    }
}
function checkTerms(event) {
    if (!elTerms.checked) {
        elTermsHint.innerHTML = 'You must argree to the terms.';
    }
}
elForm.addEventListener('change', checkTerms, false);
elSelectPackage.addEventListener('change', packageHint, false);
