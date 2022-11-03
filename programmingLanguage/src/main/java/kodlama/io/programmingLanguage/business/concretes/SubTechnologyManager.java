package kodlama.io.programmingLanguage.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguage.business.abstracts.LanguageService;
import kodlama.io.programmingLanguage.business.abstracts.SubTechnologyService;
import kodlama.io.programmingLanguage.business.requests.techRequests.CreateSubTechnologyRequest;
import kodlama.io.programmingLanguage.business.requests.techRequests.UpdateSubTechnolgyRequest;
import kodlama.io.programmingLanguage.business.responses.techResponses.GetAllSubTechnologyResponse;
import kodlama.io.programmingLanguage.dataAccess.SubTechnologyRepository;
import kodlama.io.programmingLanguage.entities.Language;
import kodlama.io.programmingLanguage.entities.SubTechnology;

@Service

public class SubTechnologyManager implements SubTechnologyService {

	private SubTechnologyRepository subTechnologyRepository;
	private LanguageService languageService;
	
	

	@Override
	public List<GetAllSubTechnologyResponse> getAll() {
		 
		List<SubTechnology> subTechnologies = this.subTechnologyRepository.findAll();
		List<GetAllSubTechnologyResponse> subTechResponse = new ArrayList<GetAllSubTechnologyResponse>();
		
		for(SubTechnology subTechnology :subTechnologies) {
			GetAllSubTechnologyResponse response = new GetAllSubTechnologyResponse();
			response.setId(subTechnology.getId());
			response.setName(subTechnology.getName());
			response.setLanguage(subTechnology.language.getName());
			subTechResponse.add(response);
		}
		return subTechResponse;
	}

	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository, LanguageService languageService) {
		super();
		this.subTechnologyRepository = subTechnologyRepository;
		this.languageService = languageService;
	}


	@Override
	public void add(CreateSubTechnologyRequest subTechnologyRequest) {
		Language language = languageService.getOneLanguage(subTechnologyRequest.getId());
		SubTechnology subTechnology = new SubTechnology();
	subTechnology.setLanguage(language);;
		subTechnology.setName(subTechnologyRequest.getName());
		subTechnology.setLanguage(language);
		subTechnologyRepository.save(subTechnology);
	}


	@Override
	public void update(UpdateSubTechnolgyRequest updateRequest, int id) {
		
		SubTechnology subTechnology = getOneSubTechnology(id);
		Language language = this.languageService.getOneLanguage(updateRequest.getId());
		
		subTechnology.setLanguage(language);
		subTechnology.setName(updateRequest.getName());
		
		this.subTechnologyRepository.save(subTechnology);
	}


	@Override
	public SubTechnology getOneSubTechnology(int id) {
		 SubTechnology subTechnology = this.subTechnologyRepository.findById(id).orElse(null);
		 return subTechnology;
	}


	@Override
	public void delete(int id) {
	this.subTechnologyRepository.deleteById(id);
	}

}
