import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, tap } from 'rxjs';
import { Chat } from '../interface/chat';

@Injectable({
  providedIn: 'root'
})
export class ServerService {

  constructor(private http: HttpClient) { }

  getChats(): Observable<Chat> {
    return this.http.get<Chat>(`http://localhost:8081/chat`)
  }
}
