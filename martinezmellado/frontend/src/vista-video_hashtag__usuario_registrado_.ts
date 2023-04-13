import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-video_hashtag__usuario_registrado__item';

@customElement('vista-video_hashtag__usuario_registrado_')
export class VistaVideo_hashtag__usuario_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-mi_cabecera style="width: 100%; height: 5%;"></vista-mi_cabecera>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 95%; align-items: center; justify-content: center;">
  <label>HashTag</label>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
   <vista-video_hashtag__usuario_registrado__item></vista-video_hashtag__usuario_registrado__item>
   <vista-video_hashtag__usuario_registrado__item></vista-video_hashtag__usuario_registrado__item>
   <vista-video_hashtag__usuario_registrado__item></vista-video_hashtag__usuario_registrado__item>
   <vista-video_hashtag__usuario_registrado__item></vista-video_hashtag__usuario_registrado__item>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: flex-start;">
   <vista-video_hashtag__usuario_registrado__item></vista-video_hashtag__usuario_registrado__item>
   <vista-video_hashtag__usuario_registrado__item></vista-video_hashtag__usuario_registrado__item>
   <vista-video_hashtag__usuario_registrado__item></vista-video_hashtag__usuario_registrado__item>
   <vista-video_hashtag__usuario_registrado__item></vista-video_hashtag__usuario_registrado__item>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
