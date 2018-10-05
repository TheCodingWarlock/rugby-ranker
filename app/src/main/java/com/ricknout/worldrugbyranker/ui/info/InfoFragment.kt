package com.ricknout.worldrugbyranker.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ricknout.worldrugbyranker.R
import kotlinx.android.synthetic.main.fragment_info.*
import android.content.Intent
import android.net.Uri
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity

class InfoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_info, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        howAreWorldRugbyRankingsCalculatedButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(RANKINGS_EXPLANATION_URL))
            startActivity(intent)
        }
        shareThisAppButton.setOnClickListener {
            // TODO: Once app is available on Play Store
        }
        viewSourceCodeButton.setOnClickListener {
            // TODO: Once app is open sourced on GitHub
        }
        openSourceLicensesButton.setOnClickListener {
            val intent = Intent(requireContext(), OssLicensesMenuActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        const val TAG = "InfoFragment"
        private const val RANKINGS_EXPLANATION_URL = "https://www.world.rugby/rankings/explanation"
    }
}
