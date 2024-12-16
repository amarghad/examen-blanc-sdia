import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-conferences',
  templateUrl: './conferences.component.html',
  styleUrl: './conferences.component.css'
})
export class ConferencesComponent implements OnInit{
  public conferences : any;

  constructor(private http : HttpClient, private router : Router) {
  }
  ngOnInit() {
    this.http.get("http://localhost:8082/api/conferences").subscribe({
      next : conferences => {
        this.conferences = conferences;
      },
      error : err => {
        console.log(err);
      }
    })
  }

  getConferenceDetails(o:any) {
    this.router.navigateByUrl("/conference-details/"+o.id);
  }
}
