package com.lmorda.repodetails

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.lmorda.coreui.ListDetailsTheme

@Composable
fun RepoDetailsScreen() {
    ListDetailsTheme {
        Text("Repo Details Go Here")
    }
}

@Preview
@Composable
fun RepoDetailsScreenPreview() {
    RepoDetailsScreen()
}