package com.example.navigationui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.navigationui.databinding.*

class HomeFragment : Fragment(R.layout.fragment_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val binding = FragmentLayoutBinding.bind(view)
        binding.textView2.text = "게시물 페이지"
    }
}

class Profil : Fragment(R.layout.profil_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
       //val binding = ProfilLayoutBinding.bind(view)
    }
}

class FriendHome : Fragment(R.layout.friend_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val binding = FriendLayoutBinding.bind(view)
        binding.textView5.text = "친구 목록"
    }
}

class BlockList : Fragment(R.layout.block_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        //val binding = BlockListBinding.bind(view)
    }
}

class BestFriendList : Fragment(R.layout.bestfriend_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        //val binding = BestfriendListBinding.bind(view)
    }
}

/*
class FriendPage : Fragment(R.layout.friendlist_layout){
    lateinit var mainActivity:MainActivity

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FriendlistLayoutBinding.bind(view)
        binding.button3.setOnClickListener {
            val intent = Intent(mainActivity, FriendActivity::class.java)
            startActivity(intent)
        }
    }
}
*/