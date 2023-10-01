package com.idwall.challengeapi.services;

import com.idwall.challengeapi.entities.FBI.FBIResponse;
import com.idwall.challengeapi.entities.FBI.Item;
import com.idwall.challengeapi.interfaces.FBIParameters;
import com.idwall.challengeapi.repositories.FBIRepository;
import com.idwall.challengeapi.utils.GetConnection;
import com.idwall.challengeapi.utils.GetResponseString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class FBIService {
	@Autowired
	private FBIResponse fbiResponse;
	@Autowired
	FBIRepository fbiRepository;
	private final GetResponseString<FBIResponse> getResponseString;

	public FBIService(GetResponseString<FBIResponse> getResponseString) {
		this.getResponseString = getResponseString;
	}

	public Item[] BuscarFBI(FBIParameters fbiParameters) {
		try {
			GetConnection<FBIParameters> getConnection = new GetConnection<>();
			HttpURLConnection connection = getConnection.get(fbiParameters, "https://api.fbi.gov/@wanted");
			connection.setRequestProperty("User-Agent", "idwall-api/1.0");

			// codigo de resposta http
			int responseCode = connection.getResponseCode();
			if (responseCode == 200) {

				this.fbiResponse = getResponseString.getString(connection, FBIResponse.class);

				if (fbiResponse != null && fbiResponse.getItems() != null) {
					fbiResponse.getItems();
					fbiRepository.saveAll(Arrays.asList(fbiResponse.getItems()));
				}
				assert fbiResponse != null;
				return fbiResponse.getItems();
			} else {
				return new Item[0];
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new Item[0];
		}
	}

	@Transactional
	public List<Item> BuscarPorNomeDB(String title){
		List<Item> items = fbiRepository.BuscarPorNome(title);
		items.forEach(item -> item.getImages().size());
		return items;
	}

}
